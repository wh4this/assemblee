import Mandate from 'src/model/Mandate';
import PoliticalBodyDetails from 'src/model/PoliticalBodyDetails';
import PoliticalBodySearchItem from 'src/model/PoliticalBodySearchItem';

export default class LabelService {

    public static getQuality(mandate: Mandate): string {

        let quality = 'Membre';
        
        if(mandate.quality) {

            if(mandate.quality.endsWith("du")) {
                // "membre du" => "membre"
                quality = mandate.quality.split(" du")[0];
            } else {
                quality = mandate.quality;
            }
        }

        return quality;
    }

    public static getItemTitle(politicalBody: PoliticalBodySearchItem) : string {
        return LabelService._getTitle(politicalBody.legislature, politicalBody.label, politicalBody.startDate, politicalBody.endDate);
    }

    public static getPageTitle(politicalBody: PoliticalBodyDetails) : string {
        return LabelService._getTitle(politicalBody.legislature, politicalBody.politicalBodyLabel, politicalBody.startDate, politicalBody.endDate);
    }

    private static _getTitle(legislature: number, label: string, startDate?: Date, endDate?: Date) : string {
        let title = '';

        if(startDate) {
            
            let period = 'du ' + startDate.toLocaleDateString('fr-FR') + ' à ce jour';
            if(endDate) {
                period = 'du ' + startDate.toLocaleDateString('fr-FR') + ' au ' + endDate.toLocaleDateString('fr-FR');
            }

            if(legislature > 0) {
                title = label + ' (' + period + ', ' + legislature + 'è législature)';
            } else {
                title = label + ' (' + period + ')';
            }
        }
        else {
            if(legislature > 0) {
                title = label + ' (' + legislature + 'è législature)';
            } else {
                title = label;
            }
        }

        return title;
    }
}