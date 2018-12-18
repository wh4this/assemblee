import * as React from 'react';
import Mandate from 'src/model/Mandate';
import {Link} from 'react-router-dom';

interface IMandateTableProps {
    title: string,
    mandates?: Mandate[],
}

export const MandateTable : React.StatelessComponent<IMandateTableProps> = (props) => {
    
    if(!props.mandates || props.mandates.length === 0) {
        return <div />;
    }
    
    const rows = props.mandates.map((mandate) => {
        return (
            <tr key={mandate.mandateId}>
                <td>
                    <Link to={'/organes/'+mandate.politicalBodyId}>
                        {mandate.politicalBodyLabel} 
                        {mandate.legislature > 0 && <span> ({mandate.legislature}è législature)</span>}
                    </Link>
                </td>
                <td>
                    {mandate.politicalBodyType} 
                    <br />
                    {mandate.quality} 
                </td>
                <td>
                    {mandate.endDate && <span>du {mandate.startDate.toLocaleDateString('fr-FR')} au {mandate.endDate.toLocaleDateString('fr-FR')}</span>}
                    {!mandate.endDate && <span>depuis le {mandate.startDate.toLocaleDateString('fr-FR')}</span>}
                </td>
            </tr>
        )
     }
    );

    return (
        <div style={{marginTop: '50px'}}>
            <h3 className="subtitle">{props.title} : </h3>

            <table className="table is-bordered is-narrow is-hoverable is-striped">

                <thead>
                    <tr>
                        <th>Nom du mandat</th>
                        <th>Type de mandat<br />Rôle</th>
                        <th>Période</th>
                    </tr>
                </thead>

                <tbody>
                    {rows}
                </tbody>

            </table>
        </div>
    );
}